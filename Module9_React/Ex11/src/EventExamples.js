import React, { Component } from "react";

class EventExamples extends Component {

    constructor(props) {
        super(props);

        this.state = {
            count: 0
        };
    }

    increment = () => {
        this.setState({
            count: this.state.count + 1
        });
    };

    decrement = () => {
        this.setState({
            count: this.state.count - 1
        });
    };

    sayHello = () => {
        alert("Hello! Have a nice day.");
    };

    handleIncrement = () => {
        this.increment();
        this.sayHello();
    };

    sayWelcome = (message) => {
        alert(message);
    };

    onPress = () => {
        alert("I was clicked");
    };

    render() {

        return (

            <div style={{ margin: "20px" }}>

                <h1>React Event Examples</h1>

                <h2>Counter : {this.state.count}</h2>

                <button onClick={this.handleIncrement}>
                    Increment
                </button>

                &nbsp;

                <button onClick={this.decrement}>
                    Decrement
                </button>

                <br /><br />

                <button
                    onClick={() => this.sayWelcome("Welcome")}
                >
                    Say Welcome
                </button>

                <br /><br />

                <button onClick={this.onPress}>
                    Click on me
                </button>

            </div>

        );

    }
}

export default EventExamples;