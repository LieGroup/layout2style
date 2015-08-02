### 一个简单的可视化工具，将Android布局文件中的View属性批量转换为style.xml中的item标签
- 例如：`android:layout_width="wrap_content"` 转换为 `<item name="android:layout_width">wrap_content</item>`

### 使用方式：
- main方法在io.github.fantacyleo.layoutstyleconvertor.Launcher类中
- 在顶部文本域中粘贴布局文件中的View属性(任意行数)，点击转换按钮，对应的item标签即显示在底部文本域中

