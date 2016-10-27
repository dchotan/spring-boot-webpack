import React from 'react';
import {Router, Route, hashHistory} from 'react-router';
import Main from 'components/Main';

/**
 * You could optionally pass {@code dispatch} to {@code getRoutes}.  Then you could dispatch events in a route's
 * {@code onEnter} or {@code onLeave} event handlers.
 */
export function getRoutes() {
  return (
    <Router history={hashHistory}>
      <Route path="/" component={Main}/>
    </Router>
  );
}