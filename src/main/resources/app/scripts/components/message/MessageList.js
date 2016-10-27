import React, {PropTypes} from 'react';
import {connect} from 'react-redux';
import 'styles/components/message.scss';

const propTypes = {
  messages: PropTypes.array
};

function MessageList({messages}) {
  return (
    <div className="message-list">
      <h2>Messages</h2>
      <ul>{messages.map((msg) => <li key={msg.id} className={`message ${msg.id === 1 ? 'unread' : ''}`}>{msg.messageString}</li>)}</ul>
    </div>
  );
}

MessageList.propTypes = propTypes;

function mapStateToProps({messages}) {
  return {...messages};
}

export default connect(mapStateToProps)(MessageList);