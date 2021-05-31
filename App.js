import React from 'react';
import {
  Button,
  NativeModules,
  View,
  Text,
  StyleSheet
} from 'react-native';

const MyToast = NativeModules.MyToastModule;

export default class App extends React.Component {

  componentDidMount() {

  }

  buttonPressed(){
    // show Toast message from Native
    MyToast.showMessage("My second Message");
  }

  render() {
    return (
      <View style={styles.container}>
        <Button onPress={() => this.buttonPressed()} title="Show Message">
      
        </Button>

      </View>
    );
  }
};

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: "white",
    justifyContent: 'center',
    alignItems: 'center'
  }
});