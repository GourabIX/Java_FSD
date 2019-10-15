var Student = /** @class */ (function () {
    function Student(rollNo, name) {
        // including this is mandatory. If not included, object property will be undefined.
        this.rollNo = rollNo;
        this.name = name;
    }
    Student.prototype.display = function () {
        console.log(this.rollNo + ", " + this.name);
    };
    return Student;
}());
var std = new Student(21, "Gourab Sarkar");
std.display();
var std2 = new Student(22, "Sudhanya");
std2.display();
console.log(std2.rollNo);
