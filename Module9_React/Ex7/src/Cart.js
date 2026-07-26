import React, { Component } from "react";

class Cart extends Component {

    render() {

        return (

            <div style={{
                border: "1px solid black",
                width: "250px",
                padding: "10px",
                margin: "10px",
                borderRadius: "10px"
            }}>

                <h3>Item Name : {this.props.itemName}</h3>

                <h3>Price : ₹{this.props.price}</h3>

            </div>

        );

    }

}

export default Cart;