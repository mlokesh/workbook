var products = [
    {id : 5, name : "Pen", cost : 40, units : 60, category : 2},
    {id : 9, name : "Hen", cost : 70, units : 30, category : 1},
    {id : 8, name : "Ten", cost : 80, units : 80, category : 2},
    {id : 3, name : "Den", cost : 60, units : 50, category : 1},
    {id : 4, name : "Len", cost : 30, units : 70, category : 2},
    {id : 6, name : "Ken", cost : 90, units : 20, category : 1}
]

function display(title, fn) {
    console.group(title);
    fn();
    console.groupEnd();
}

display("Functional Programming", function() {
    display("Initial List", function() {
        console.table(products);
    })
});

console.group("Initial List");
console.table(products);
console.groupEnd();

function sort() {
    for (var i = 0; i < products.length - 1; i++) {
        for (var j = i + 1; j < products.length; j++) {
            var left = products[i];
            right = products[j];
            if (left.id > right.id) {
                products[i] = products[j];
                products[j] = left;
            }
        }
    }
}

console.group("Sorting");
console.group("Default sort (by id)");
sort();
console.table(products);
console.groupEnd();
console.groupEnd();


/*
sort
filter
all
any
countBy
min
max
sum
aggregate
groupBy
 */

