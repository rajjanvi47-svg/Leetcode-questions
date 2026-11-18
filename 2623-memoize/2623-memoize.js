
function memoize(fn) {
    let dp = {};

    return function(...args) {
        let key = JSON.stringify(args);

        return dp[key] ??= fn(...args);
    }
}
