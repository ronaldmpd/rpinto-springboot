angular.module('myApp', ['dataGrid', 'pagination', 'ngMaterial'])
    .controller('myAppController', ['$scope', 'myAppFactory', function ($scope, myAppFactory) {

        $scope.gridOptions = {
            data: [],
            urlSync: true
        };
        myAppFactory.getData().then(function (responseData) {
            console.log("the data is", responseData);
            $scope.gridOptions.data = responseData.data;
        });

    }])
    .factory('myAppFactory', function ($http) {
        return {
            getData: function () {
                return $http({
                    method: 'GET',
                    url: 'http://localhost:8080/teachers'
                });
            }
        }
    });

