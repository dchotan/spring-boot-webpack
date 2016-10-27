import {getResource} from 'util/request';

export const RECEIVE_MESSAGES = 'RECEIVE_MESSAGES';

export function receiveMessages(messages) {
  return {type: RECEIVE_MESSAGES, messages};
}

export function fetchMessages() {
  return (dispatch) => {
    return getResource('/messages').then(({entity}) => dispatch(receiveMessages(entity)));
  };
}