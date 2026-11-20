var cancellable = function(fn, args, t) {

    const timer = setTimeout(() => {
        let result = fn(...args);
        console.log("Result:", result);
    }, t);

    const cancelFn = function() {
        clearTimeout(timer);
        console.log("Timer cancelled");
    };

    return cancelFn;
};