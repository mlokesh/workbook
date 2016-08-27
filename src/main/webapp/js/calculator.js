function add(x, y) {
    if (x === "") {
        throw new Error("Test");
    }
    function parseArg(n) {
        if(Array.isArray(n)) return add.apply(this, n);
        if (typeof n === "function") return parseArg(n());
        return isNaN(n) ? 0 : parseInt(n, 10);
    }
    //return arguments.length <= 1 ? parseArg(arguments[0]) : parseArg(arguments[0]) + add([].slice.call(arguments, 1));

    return arguments.length <= 1 ? parseArg(arguments[0]) : parseArg(arguments[0]) + add(Array.prototype.slice.call(arguments, 1));

}

function addOrg(x, y) {
    function parseArg(n) {
        if(Array.isArray(n)) return addOrg.apply(this, n);
        if (typeof n === "function") return parseArg(n());
        return isNaN(n) ? 0 : parseInt(n, 10);
    }
    var result = 0;
    for (var i = 0; i<arguments.length; i++) {
        result += parseArg(arguments[i]);
    }
    return result;
}

