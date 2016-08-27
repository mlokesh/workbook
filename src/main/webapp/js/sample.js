function getSpinner() {
    var count = 0;
    function increment() {
        return ++count;
    }
    function decrement() {
        return --count;
    }
    return {
        up : increment,
        down : decrement
    }
}

/*
var spinner = getSpinner();
spinner.up();
spinner.down();
*/

