unit DW.NativeControlModel;

{*******************************************************}
{                                                       }
{                      Kastri                           }
{                                                       }
{         Delphi Worlds Cross-Platform Library          }
{                                                       }
{  Copyright 2020-2021 Dave Nottage under MIT license   }
{  which is located in the root folder of this library  }
{                                                       }
{*******************************************************}

{$I DW.GlobalDefines.inc}

interface

uses
  // RTL
  System.Classes,
  // FMX
  FMX.Controls.Model;

type
  TNativeControlModel = class(TDataModel)
  private
    FOnLongPress: TNotifyEvent;
  public
    procedure DoLongPress;
    property OnLongPress: TNotifyEvent read FOnLongPress write FOnLongPress;
  end;

implementation

{ TNativeControlModel }

procedure TNativeControlModel.DoLongPress;
begin
  if Assigned(FOnLongPress) then
    FOnLongPress(Self);
end;

end.
