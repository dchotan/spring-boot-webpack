import React from 'react';
import {render} from 'react-dom';

import Item from './components/item';
import ItemList from './components/itemlist';

export default class App extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      items: ['item 1', 'item 2', 'item 3']
    };
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