import "../Stylesheets/mystyle.css";

function CalculateScore(props) {

    const score = ((props.total / props.goal) * 100).toFixed(2);

    return (
        <div className="student">
            <h1>Student Details:</h1>

            <h3>
                Name: <span>{props.name}</span>
            </h3>

            <h3>
                School: <span>{props.school}</span>
            </h3>

            <h3>
                Total: <span>{props.total}Marks</span>
            </h3>

            <h3>
                Score: <span>{score}%</span>
            </h3>
        </div>
    );
}

export default CalculateScore;