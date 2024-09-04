define(["Class"], function (Class) {
        "use strict";

        return Class.extend({

            init(params) {
                this._params = params;
                this.eGui = document.createElement("div");
                this.newMarkupBtn = document.createElement("button");
                this.newMarkupBtn.className = "btn-primary";
                this.newMarkupBtn.textContent = "New Markup";
                // this.eventListener = () => alert("clicked");
                //button.addEventListener("click", this.eventListener);
                this.eGui.appendChild(this.newMarkupBtn);
            },
            getGui() {
                return this.eGui;
            },

            refresh(params) {
                return true;
            },

            destroy() {
                if (this.newMarkupBtn) {
                    this.newMarkupBtn.removeEventListener("click", this.eventListener);
                }
            }
        })
    }
)