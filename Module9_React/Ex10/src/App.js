import logo from './logo.svg';
import './App.css';

import officeImage from "./office_image1.jpg";

function App() {

  const offices = [

    {
      name: "DBS Business Center",
      rent: 55000,
      address: "Chennai"
    },

    {
      name: "Tidel Park",
      rent: 75000,
      address: "Chennai"
    },

    {
      name: "DLF IT Park",
      rent: 65000,
      address: "Hyderabad"
    }

  ];

  return (

    <div style={{ margin: "20px" }}>

      <h1>Office Space Rental App</h1>

      <img
        src={officeImage}
        alt="Office"
        width="400"
        height="250"
      />

      <hr />

      {

        offices.map((office, index) => (

          <div key={index}>

            <h2>{office.name}</h2>

            <p>

              <b>Address :</b> {office.address}

            </p>

            <p>

              <b>Rent :</b>

              <span
                style={{
                  color:
                    office.rent < 60000
                      ? "red"
                      : "green"
                }}
              >

                ₹ {office.rent}

              </span>

            </p>

            <hr />

          </div>

        ))

      }

    </div>

  );

}

export default App;
