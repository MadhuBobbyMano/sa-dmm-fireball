require([
    "common-ui/controllers/_NavigationController",
    "agGridComponents/editMarkUp",
    "agGridComponents/withoutMarkup",
    "app.json"
], function(NavigationController,
            editMarkUp,
            withoutMarkup,
            appConfig) {

    var app = new NavigationController({
        appConfig : appConfig,
        customWidgetConstructors : {
            AGGrid: require("./common-ui/widgets/grid/AGGrid"),
        },
        agGridComponents: {
            editMarkUp,
            withoutMarkup
        }
    });

});
