import {RECEIVE_MESSAGES} from './MessageActionCreators';

const initialState = {
  messages: []
};

export default function reducer(state = initialState, action) {
  switch (action.type) {
    case RECEIVE_MESSAGES: {
      const {messages} = action;
      return {...state, messages};
    }
    default:
      return state;
  }
}