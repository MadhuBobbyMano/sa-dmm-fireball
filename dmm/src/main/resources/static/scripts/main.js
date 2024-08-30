require([
    "common-ui/controllers/_NavigationController",
    "agGridComponents/editMarkUp",
    "app.json"
], function(NavigationController,
            editMarkUp,
            appConfig) {

    var app = new NavigationController({
        appConfig : appConfig,
        customWidgetConstructors : {
            AGGrid: require("./common-ui/widgets/grid/AGGrid"),
        },
        agGridComponents: {
            editMarkUp
        }
    });

});
