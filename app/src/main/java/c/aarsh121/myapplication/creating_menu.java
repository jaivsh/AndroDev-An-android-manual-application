package c.aarsh121.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.Toast;

public class creating_menu extends AppCompatActivity {
    Button btnpopupmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creating_menu);
        ListView listView=(ListView)findViewById(R.id.listview);
        String[] games={"IGI","Mini Militia","GTA V","GTA SA","COC"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,games);
        listView.setAdapter(adapter);
        registerForContextMenu(listView);
         btnpopupmenu=(Button)findViewById(R.id.popup);
       btnpopupmenu.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               PopupMenu popupMenu=new PopupMenu(creating_menu.this,btnpopupmenu);
               popupMenu.getMenuInflater().inflate(R.menu.menu_main,popupMenu.getMenu());
               popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                   @Override
                   public boolean onMenuItemClick(MenuItem item) {
                       Toast.makeText(getApplicationContext(),"Item clicked:"+item.getTitle(),Toast.LENGTH_SHORT).show();
                       return true;
                   }
               });
               popupMenu.show();
           }
       });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch(item.getItemId())
        {
            case R.id.item1:
                Toast.makeText(this,"Item 1 is clicked",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item2:
                Toast.makeText(this,"Item 2 is clicked",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item3:
                Toast.makeText(this,"Item 3 is clicked",Toast.LENGTH_SHORT).show();
                return true;
                default:
                    return super.onOptionsItemSelected(item);
        }
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,ContextMenu.ContextMenuInfo menuInfo)
    {
        super.onCreateContextMenu(menu,v,menuInfo);
        menu.setHeaderTitle("Select the action");
        menu.add(0,v.getId(),0,"Play");
        menu.add(0,v.getId(),0,"uninstall");
        menu.add(0,v.getId(),0,"visit");
    }
    @Override
    public boolean onContextItemSelected(MenuItem item)
    {
        if(item.getTitle()=="Play")
        {
            Toast.makeText(this,"Play is pressed",Toast.LENGTH_SHORT).show();
        }
        else if(item.getTitle()=="uninstall")
        {
            Toast.makeText(this,"uninstall is pressed",Toast.LENGTH_SHORT).show();
        }
        else if(item.getTitle()=="visit")
        {
            Toast.makeText(this,"visit is pressed",Toast.LENGTH_SHORT).show();
        }
        return true;
    }
}
