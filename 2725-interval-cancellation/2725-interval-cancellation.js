var cancellable = function(fn, args, t) {

    // 1. Run immediately
    fn(...args);

    // 2. Repeat after every t milliseconds
    const timer = setInterval(() => {
        fn(...args);
    }, t);

    // 3. Stop repeating
    return function() {
        clearInterval(timer);
    };
};