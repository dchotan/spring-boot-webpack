import React, {PropTypes, Component} from 'react';
import {bindActionCreators} from 'redux';
import {connect} from 'react-redux';
import {fetchMessages} from 'components/message/MessageActionCreators';
import MessageList from 'components/message/MessageList';
import 'styles/main.scss';

const propTypes = {
  fetchMessages: PropTypes.func
};

class Main extends Component {
  componentDidMount() {
    const {fetchMessages} = this.props;
    fetchMessages();
  }

  render() {
    return (
      <div>
        <h1>Spring Boot Rocks!</h1>
        <MessageList/>
      </div>
    );
  }
}

Main.propTypes = propTypes;

function mapDispatchToProps(dispatch) {
  return bindActionCreators({fetchMessages}, dispatch);
}

export default connect(null, mapDispatchToProps)(Main);