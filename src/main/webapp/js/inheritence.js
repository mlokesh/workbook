/*
 prototypal inheritence
*/


function Employee(name, salary)
{
    this.name = name;
    this.salary = salary;
}

Employee.prototype.id = 100;
Employee.prototype.display = function(){
    console.log(this.id, this.name, this.salary);
}

var emp1 = new Employee("emp1", 1000);
var emp1 = new Employee("emp2", 2000);

emp1.display();
emp2.display();

// Inheritence -- accessibility
// Invocation context is not affected by inheritence

emp2.display().call(emp1);

Employee.prototype.display().call(emp1);

// call and apply


function SalaryCalculator(basic, hra, da, tax) {
    this.basic = basic;
    this.hra = hra;
    this.da = da;
    this.tax = tax;
    this.salary = 0;

    this.calculate = function() {
        var gross = this.basic + this.hra + this.da;
        var net = gross * ((100-this.tax)/100);
        this.salary = net;
    }
}