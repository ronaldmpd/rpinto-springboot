$(function () {
    $.getJSON("http://127.0.0.1:9091/students", function(data){
        var quickGrid = $("#myGrid").quickGrid({
        data: data,
        onrowdelete: function ( rownum, rowdata) {
            console.log("the row to delete is ", rowdata);
            console.log("the row number ", rownum);
            $.ajax({
                type: "DELETE",
                url: "http://127.0.0.1:9091/students",
                data:  JSON.stringify(rowdata),
                success: function(){
                    console.log("DONE DELETE")
                },
                contentType: 'application/json'
            });
         }

        })
        .on('qgrd:updaterow', function(event, rowData){
            //console.log("update data", rowData);
            $.ajax({
                type: "PATCH",
                url: "http://127.0.0.1:9091/students",
                data:  JSON.stringify(rowData),
                success: function(){
                    console.log("DONE UPDATE")
                },
                contentType: 'application/json'
            });
            
            console.log("The updated data Is:", rowData)
        })
        .on('qgrd:addrow', function(event, rowData){
            // do something 
           //console.log("add data", rowData);
           $.ajax({
                type: "POST",
                url: "http://127.0.0.1:9091/students",
                data:  JSON.stringify(rowData),
                success: function(){
                    console.log("DONE POST")
                },
                contentType: 'application/json'
            });
            console.log("The new Data is", rowData)
        })
    });
});