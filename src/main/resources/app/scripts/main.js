import React from 'react';
import {render} from 'react-dom';
import rest from 'rest';

import Item from 'components/item';
import ItemList from 'components/itemlist';

export default class App extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      items: []
    };
  }

  componentDidMount() {
    rest('/items').then(items => this.setState({items: JSON.parse(items.entity)}));
  }

  render() {
    return (
      <div>
        <h1>Spring Boot Webpack</h1>
        <ItemList>
          {this.state.items.map((v, k) => <Item key={k} value={v}/>)}
        </ItemList>
      </div>
    );
  }
}

render(<App/>, document.getElementById('app'));