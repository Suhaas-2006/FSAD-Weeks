package com.klh.service;

import com.klh.model.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    private final List<Course> courseList = new ArrayList<>();

    // ADD COURSE
    public Course addCourse(Course course) {
        courseList.add(course);
        return course;
    }

    // GET ALL COURSES
    public List<Course> getAllCourses() {
        return courseList;
    }

    // GET COURSE BY ID
    public Course getCourseById(int id) {
        for (Course course : courseList) {
            if (course.getCourseId() == id) {
                return course;
            }
        }
        return null;
    }

    // UPDATE COURSE
    public Course updateCourse(int id, Course updatedCourse) {
        Course existing = getCourseById(id);
        if (existing != null) {
            existing.setTitle(updatedCourse.getTitle());
            existing.setDuration(updatedCourse.getDuration());
            existing.setFee(updatedCourse.getFee());
            return existing;
        }
        return null;
    }

    // DELETE COURSE
    public boolean deleteCourse(int id) {
        Course course = getCourseById(id);
        if (course != null) {
            courseList.remove(course);
            return true;
        }
        return false;
    }

    // SEARCH BY TITLE
    public List<Course> searchByTitle(String title) {
        List<Course> result = new ArrayList<>();
        for (Course course : courseList) {
            if (course.getTitle().equalsIgnoreCase(title)) {
                result.add(course);
            }
        }
        return result;
    }
}
