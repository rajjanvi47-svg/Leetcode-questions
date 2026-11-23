Array.prototype.groupBy = function(fn) {

    // Create an empty object
    let result = {};

    // Loop through the array
    for (let i = 0; i < this.length; i++) {

        // Get the key using fn
        let key = fn(this[i]);

        // Check if key already exists
        if (!result[key]) {
            result[key] = [];
        }

        // Add the current element to its group
        result[key].push(this[i]);
    }

    // Return the grouped object
    return result;
};