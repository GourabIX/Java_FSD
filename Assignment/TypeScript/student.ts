class Student
{
    rollNo: number;
    name: string;

    constructor(rollNo:number, name:string)
    {
        // including this is mandatory. If not included, object property will be undefined.
        this.rollNo = rollNo;
        this.name = name;
    }

    display():void
    {
        console.log(this.rollNo + ", " + this.name);
    }
}

let std: Student = new Student(21, "Gourab Sarkar");
std.display();