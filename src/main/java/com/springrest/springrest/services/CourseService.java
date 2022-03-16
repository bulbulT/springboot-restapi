package com.springrest.springrest.services;
import java.util.List;

import com.springrest.springrest.entities.Course;

public interface CourseService {
    public List<Course> getCourse();

    public Course getCourse(long courseId);

    Course addCourse(Course course);

    Course updateCourse(Course course);

    void deleteCourse(long parseLong);
}
