import React, { Component } from "react";
import Cart from "./Cart";

class OnlineShopping extends Component {

    constructor(props) {

        super(props);

        this.items = [

            {
                itemName: "Laptop",
                price: 80000
            },

            {
                itemName: "TV",
                price: 120000
            },

            {
                itemName: "Washing Machine",
                price: 50000
            },

            {
                itemName: "Mobile",
                price: 30000
            },

            {
                itemName: "Fridge",
                price: 70000
            }

        ];

    }

    render() {

        return (

            <div>

                <h1>Shopping Cart</h1>

                {

                    this.items.map((item, index) => (

                        <Cart

                            key={index}

                            itemName={item.itemName}

                            price={item.price}

                        />

                    ))

                }

            </div>

        );

    }

}

export default OnlineShopping;