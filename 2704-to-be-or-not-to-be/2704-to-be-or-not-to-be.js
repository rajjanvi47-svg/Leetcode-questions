
var expect = function(val) {

    function toBe(n) {
        if (val === n) {
            return true;
        } else {
            throw new Error("Not Equal");
        }
    }

    function notToBe(n) {
        if (val !== n) {
            return true;
        } else {
            throw new Error("Equal");
        }
    }

    return {
        toBe: toBe,
        notToBe: notToBe
    };

};
