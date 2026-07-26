import React from "react";

function ListofPlayers() {

    const players = [

        { name: "Sachin", score: 95 },
        { name: "Dhoni", score: 65 },
        { name: "Virat", score: 90 },
        { name: "Rohit", score: 60 },
        { name: "Yuvaraj", score: 88 },
        { name: "Raina", score: 55 },
        { name: "Hardik", score: 78 },
        { name: "Jadeja", score: 68 },
        { name: "Bumrah", score: 85 },
        { name: "Shami", score: 45 },
        { name: "Gill", score: 92 }

    ];

    const lowScorePlayers = players.filter(player => player.score < 70);

    return (

        <div>

            <h1>List of Players</h1>

            <ul>

                {
                    players.map((player, index) => (

                        <li key={index}>
                            {player.name} - {player.score}
                        </li>

                    ))
                }

            </ul>

            <hr />

            <h2>Players with Score below 70</h2>

            <ul>

                {
                    lowScorePlayers.map((player, index) => (

                        <li key={index}>
                            {player.name} - {player.score}
                        </li>

                    ))
                }

            </ul>

        </div>

    );

}

export default ListofPlayers;