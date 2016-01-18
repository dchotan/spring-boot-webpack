import path from 'path';
import ExtractTextPlugin from 'extract-text-webpack-plugin';
import HtmlWebpackPlugin from 'html-webpack-plugin';
import CleanWebpackPlugin from 'clean-webpack-plugin';

let buildDir = 'public';

export default {
  entry: './app/scripts/main.js',
  output: {
    path: path.join(__dirname, buildDir),
    filename: '[name].js',
    chunkFilename: '[id].js'
  },
  resolve: {
    extensions: ['', '.js', '.css'],
    alias: {
      'styles': __dirname + '/app/styles',
      'components': __dirname + '/app/scripts/components'
    }
  },
  module: {
    loaders: [
      {test: /\.scss$/, loader: ExtractTextPlugin.extract('style-loader', 'css-loader!sass-loader')},
      {test: /\.js$/, exclude: /node_modules/, loader: 'babel-loader'}
    ]
  },
  plugins: [
    new CleanWebpackPlugin([buildDir], {verbose: false}),
    new ExtractTextPlugin('[name].css'),
    new HtmlWebpackPlugin({
      hash: true,
      template: 'app/index.html',
      inject: 'body'
    })
  ]
}
