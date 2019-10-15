class Student
{
    private rollNo: number;
    private name: string;

    constructor(rollNo:number, name:string)
    {
        // including this is mandatory. If not included, object property will be undefined.
        this.rollNo = rollNo;
        this.name = name;
    }

    public display():void
    {
        console.log(this.rollNo + ", " + this.name);
    }
}

let std: Student = new Student(21, "Gourab Sarkar");
std.display();

let std2: Student = new Student(22, "Sudhanya");
std2.display();

// console.log(std2.rollNo);            // cannot access private instance variable outside class.