import React from 'react';
import {render} from 'react-dom';

export default class ItemList extends React.Component {
  render() {
    return (
      <div className="item-list">
        <h2>Cool Items</h2>
        <ul>{this.props.children}</ul>
      </div>
    );
  }
}