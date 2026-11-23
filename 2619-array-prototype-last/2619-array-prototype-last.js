
Array.prototype.last = function() {

    // Check if array is empty
    if (this.length === 0) {
        return -1;
    }

    // Return last element
    return this[this.length - 1];

};
