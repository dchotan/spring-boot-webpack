import React from 'react';
import {render} from 'react-dom';
import '../../styles/components/item.scss';

export default class Item extends React.Component {
  render() {
    return <li className="item">{this.props.value}</li>;
  }
}