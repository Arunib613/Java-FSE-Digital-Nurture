import logo from './logo.svg';
import './App.css';

import React from "react";

import BookDetails from "./BookDetails";
import BlogDetails from "./BlogDetails";
import CourseDetails from "./CourseDetails";

function App() {

    const showBooks = true;
    const showBlogs = true;
    const showCourses = true;

    let bookComponent;

    // 1. if-else

    if (showBooks) {

        bookComponent = <BookDetails />;

    }

    else {

        bookComponent = <h3>No Books Available</h3>;

    }

    return (

        <div style={{ margin: "20px" }}>

            <h1>Blogger Application</h1>

            <hr />

            {bookComponent}

            <hr />

            {/* 2. Ternary Operator */}

            {

                showBlogs

                    ?

                    <BlogDetails />

                    :

                    <h3>No Blogs Available</h3>

            }

            <hr />

            {/* 3. Logical AND */}

            {

                showCourses && <CourseDetails />

            }

        </div>

    );

}

export default App;
