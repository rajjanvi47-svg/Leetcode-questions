
class TimeLimitedCache {
    constructor() {
        this.cache = new Map();
    }

    // set method
    set(key, value, duration) {

        const alreadyExists = this.cache.get(key);

        if (alreadyExists) {
            clearTimeout(alreadyExists.timeoutId);
        }

        const timeoutId = setTimeout(() => {
            this.cache.delete(key);
        }, duration);

        this.cache.set(key, { value, timeoutId });

        return Boolean(alreadyExists);
    }

    // get method
    get(key) {

        if (this.cache.has(key)) {
            return this.cache.get(key).value;
        }

        return -1;
    }

    // count method
    count() {
        return this.cache.size;
    }
}
