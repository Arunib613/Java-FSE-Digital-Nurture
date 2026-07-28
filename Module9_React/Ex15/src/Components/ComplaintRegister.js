import React, { useState } from "react";
import "./ComplaintRegister.css";

function ComplaintRegister() {

    const [employeeName, setEmployeeName] = useState("");
    const [complaint, setComplaint] = useState("");

    const handleSubmit = (event) => {

        event.preventDefault();

        const refNo = Math.floor(Math.random() * 100) + 1;

        alert(
            "Thanks " +
            employeeName +
            "\nYour Complaint was Submitted.\nTransaction ID is: " +
            refNo
        );

        setEmployeeName("");
        setComplaint("");
    };

    return (
        <div className="container">

            <h1>Register your complaints here!!!</h1>

            <form onSubmit={handleSubmit}>

                <table>

                    <tbody>

                        <tr>
                            <td>Name:</td>

                            <td>
                                <input
                                    type="text"
                                    value={employeeName}
                                    onChange={(e) =>
                                        setEmployeeName(e.target.value)
                                    }
                                    required
                                />
                            </td>
                        </tr>

                        <tr>
                            <td>Complaint:</td>

                            <td>
                                <textarea
                                    rows="3"
                                    value={complaint}
                                    onChange={(e) =>
                                        setComplaint(e.target.value)
                                    }
                                    required
                                ></textarea>
                            </td>
                        </tr>

                        <tr>
                            <td></td>

                            <td>
                                <button type="submit">
                                    Submit
                                </button>
                            </td>
                        </tr>

                    </tbody>

                </table>

            </form>

        </div>
    );
}

export default ComplaintRegister;