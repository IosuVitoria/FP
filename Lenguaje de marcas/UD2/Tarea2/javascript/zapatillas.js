document.addEventListener("DOMContentLoaded", function () {
    // Sample shoe data
    const shoeData = [
        {
            "model": "Shoe Model 1",
            "image": "shoe1.jpg",
            "description": "Description of the first shoe."
        },
        {
            "model": "Shoe Model 2",
            "image": "shoe2.jpg",
            "description": "Description of the second shoe."
        },
        {
            "model": "Shoe Model 3",
            "image": "shoe3.jpg",
            "description": "Description of the third shoe."
        }
        // Add more shoe entries as needed
    ];

    // Get the shoe gallery container
    const shoeGallery = document.getElementById('shoe-gallery');

    // Iterate through each shoe and create gallery items
    shoeData.forEach(shoe => {
        const shoeItem = `
            <div class="col-md-4 mb-4">
                <div class="card">
                    <img src="${shoe.image}" class="card-img-top" alt="${shoe.model}">
                    <div class="card-body">
                        <h5 class="card-title">${shoe.model}</h5>
                        <p class="card-text">${shoe.description}</p>
                    </div>
                </div>
            </div>
        `;

        // Append the shoe item to the gallery
        shoeGallery.innerHTML += shoeItem;
    });
});

