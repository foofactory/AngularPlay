(function() {
  angular.module('myApp', [])
  .controller('myController', ['$scope', '$http', function($scope, $http) {

    $scope.submitRequest = function () {
      $http.post("/submit", { request: $scope.myRequest })
      .success(function (d) { $scope.myResponse = d; });
    };
  }]);
}).call(this);
