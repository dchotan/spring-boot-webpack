import React from 'react';
import {render} from 'react-dom';
import {createStore, applyMiddleware} from 'redux';
import thunkMiddleware from 'redux-thunk';
import {Provider} from 'react-redux';

import reducer from './reducers';
import {getRoutes} from './routes';

const store = createStore(reducer, applyMiddleware(thunkMiddleware));

render(<Provider store={store}>{getRoutes(store.dispatch)}</Provider>, document.getElementById('app'));