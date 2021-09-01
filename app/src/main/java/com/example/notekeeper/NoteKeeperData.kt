package com.example.notekeeper
// notekeeper data file-contain classes that we use for modelling data in the application
//primary constructor are created after the class name and shown by parenthisis()
//secondary constructor - code run only when  created instance with specific constructor
data class CourseInfo (val courseId: String, val title: String) {
    override fun toString(): String {
        return title //return the value to display for each course
    }
}

data class NoteInfo (var course: CourseInfo, var title: String, var text: String) 
//primary constructor



//provide string rep by overridng them to string method -to display within the spinner

