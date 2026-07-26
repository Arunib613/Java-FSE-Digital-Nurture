import styles from "./CohortDetails.module.css";

const cohorts = [
    {
        code: "INTADMDF10 - .NET FSD",
        startDate: "22-Feb-2022",
        currentStatus: "Scheduled",
        coach: "Aathma",
        trainer: "Jojo Jose"
    },
    {
        code: "ADM21JF014 - Java FSD",
        startDate: "10-Sep-2021",
        currentStatus: "Ongoing",
        coach: "Apoorv",
        trainer: "Elisa Smith"
    },
    {
        code: "CDBJF21025 - Java FSD",
        startDate: "24-Dec-2021",
        currentStatus: "Ongoing",
        coach: "Aathma",
        trainer: "John Doe"
    }
];

function CohortDetails() {

    return (

        <div>

            {
                cohorts.map((cohort,index)=>(

                    <div className={styles.box} key={index}>

                        <h3
                            style={{
                                color:
                                    cohort.currentStatus==="Ongoing"
                                    ?"green"
                                    :"blue"
                            }}
                        >
                            {cohort.code}
                        </h3>

                        <dl>

                            <dt>Started On</dt>
                            <dd>{cohort.startDate}</dd>

                            <dt>Current Status</dt>
                            <dd>{cohort.currentStatus}</dd>

                            <dt>Coach</dt>
                            <dd>{cohort.coach}</dd>

                            <dt>Trainer</dt>
                            <dd>{cohort.trainer}</dd>

                        </dl>

                    </div>

                ))
            }

        </div>

    );

}

export default CohortDetails;