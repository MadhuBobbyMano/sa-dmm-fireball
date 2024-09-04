define(["Class"], function (Class) {
    "use strict";

    return Class.extend({

        init(params) {
            this._params = params;
            this.eGui = document.createElement("div");
            this.Editbutton = document.createElement("button"); // Changed from local to instance property
            this.Editbutton.className = "btn-primary";
            this.Editbutton.textContent = "Edit Markup";
            this.eventListener = () => alert("clicked");
            this.Editbutton.addEventListener("click", this.eventListener);
            this.eGui.appendChild(this.Editbutton);
        },

        getGui() {
            return this.eGui;
        },

        refresh(params) {
            return true;
        },

        destroy() {
            if (this.Editbutton) {
                this.Editbutton.removeEventListener("click", this.eventListener);
            }
        }
    })
});
