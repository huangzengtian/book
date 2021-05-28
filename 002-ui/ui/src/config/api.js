const URL_DOMAIN = `http://localhost:9001`

export default {
  GET_A_BOOK: `${URL_DOMAIN}/tbBook/selectOne`, //根据书本id查询数据集
  GET_ALL_BOOK: `${URL_DOMAIN}/tbBook/selectAll`, //查询所有书本
  GET_ALL_BOOK_BY_FUZZY: `${URL_DOMAIN}/tbBook/selectAllByFuzzy`, //模糊查询书本
  GET_BOOK_BY_FUZZY_AND_PRICE: `${URL_DOMAIN}/tbBook/selectByFuzzyAndPrice` //模糊查询书本
}