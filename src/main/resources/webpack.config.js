var path = require('path');
var ExtractTextPlugin = require('extract-text-webpack-plugin');
var HtmlWebpackPlugin = require('html-webpack-plugin');

module.exports = {
  entry: './app/scripts/main.js',
  output: {
    path: path.join(__dirname, 'public'),
    filename: '[name].js',
    chunkFilename: '[id].js'
  },
  module: {
    loaders: [
      {test: /\.scss$/, exclude: /node_modules/, loader: ExtractTextPlugin.extract('style-loader', 'css-loader!sass-loader')},
      {test: /\.js$/, exclude: /node_modules/, loader: 'babel-loader'}
    ]
  },
  plugins: [
    new ExtractTextPlugin('[name].css'),
    new HtmlWebpackPlugin({
      hash: true,
      template: 'app/index.html',
      inject: 'body'
    })
  ]
};
