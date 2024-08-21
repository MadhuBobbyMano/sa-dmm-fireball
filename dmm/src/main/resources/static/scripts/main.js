require([
    "common-ui/controllers/_NavigationController",
    "app.json"
], function(NavigationController, appConfig) {

    var app = new NavigationController({
        appConfig : appConfig,
        customWidgetConstructors : {

        }
    });

});
