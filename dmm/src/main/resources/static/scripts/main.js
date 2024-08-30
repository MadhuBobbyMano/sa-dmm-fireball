require([
    "common-ui/controllers/_NavigationController",
    "common-ui/widgets/grid/AGGrid",
    "agGridComponents/withoutMarkup",
    "app.json"
], function(NavigationController,
            AGGrid,
            withoutMarkup,
            appConfig) {

    var app = new NavigationController({
        appConfig : appConfig,
        customWidgetConstructors : {
            AGGrid : require("./common-ui/widgets/grid/AGGrid")
        },
        agGridComponents : {
            withoutMarkup
        },
    });

});
