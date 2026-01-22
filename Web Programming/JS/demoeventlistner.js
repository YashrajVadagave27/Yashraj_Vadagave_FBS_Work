document.addEventListener("DOMContentLoaded", function () {

    let image = document.getElementById("image");

    let sizeInput = document.getElementById("size");
    let typeSelect = document.getElementById("type");
    let colorInput = document.getElementById("color");
    let borderCheck = document.getElementById("border");

    // Enable / Disable border options
    borderCheck.addEventListener("change", function () {
        sizeInput.disabled = !this.checked; //this will enable or disable 
        typeSelect.disabled = !this.checked;
        colorInput.disabled = !this.checked;
    });

    // Apply button logic
    document.getElementById("applyBtn").addEventListener("click", function () {

        if (borderCheck.checked) {
            let size = sizeInput.value || 2;
            let type = typeSelect.value;
            let color = colorInput.value;

            image.style.border = `${size}px ${type} ${color}`;
        } else {
            image.style.border = "none";
        }

        // Shape logic
        let shape = document.getElementById("shape").value;

        if (shape === "circle") {
            image.style.borderRadius = "50%";
        } else if (shape === "rounded") {
            image.style.borderRadius = "20px";
        } else {
            image.style.borderRadius = "0";
        }
    });

});
