define(["Class"], function (Class) {
        "use strict";

        return Class.extend({

            init(params) {
                this._params = params;
                this.eGui = document.createElement("div");
                let button = document.createElement("button");
                button.className = "btn-primary";
                button.textContent = "Edit Markup";
                this.eventListener = () => alert("clicked");
                button.addEventListener("click", this.eventListener);
                this.eGui.appendChild(button);
            },

            getGui() {
                return this.eGui;
            },

            refresh(params) {
                return true;
            },

            destroy() {
                if (button) {
                    button.removeEventListener("click", this.eventListener);
                }
            }
        })
    }
)