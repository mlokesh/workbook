var app = angular.module('MyApp', ['ngResource']);

app.directive('sayHello', function () {

    return {
        restrict: 'EA',
        scope: {
            obj: '='
        },
        templateUrl: 'say-hello.html',
        link: function (scope, elem) {
            scope.name = scope.obj.campaignGroupId;
        }
    };
});

app.directive('sayHelloNames', function (NameFetcher) {

    return {
        restrict: 'EA',
        scope: {},
        templateUrl: 'say-hello-names-template.html',
        link: function (scope) {
            NameFetcher.getNames.get({hours: 2}, function (result) {
                    scope.names= result.pendingCampaignGenerationList;
                });
        }
    };
});

app.service('NameFetcher', function ($resource) {

    return {
        getNames: $resource('https://dap2.cobaltgroup.com/dapadmin/rest/campaign-generator/v1/history?hours=:hours')
    }
});

